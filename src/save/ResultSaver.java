package save;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultSaver {
    String str[][]=null;
    //定义行列
    int hang=0,lie=0;
    //初始化行
    int readRow=1;
    //设置数据
    public void setSourse(int hang,int lie,String sourse[][]){
        this.hang=hang;
        this.lie=lie;
        this.str=sourse;
    }
    
    public void setSourse(ResultSet rs){
		try {
			//获取列
	    	ResultSetMetaData rsmd=rs.getMetaData();
	    	lie=rsmd.getColumnCount();
	    	//获取行
	    	rs.beforeFirst();
			for(hang=0;rs.next();hang++);
			//填入表头
			str = new String[hang][lie];
			rs.beforeFirst();
			for(int i=1;i<=lie;i++)
				str[0][i] = rsmd.getColumnName(i);
			//填入数据
			for(int j=1;rs.next();j++)
				for(int i=1;i<=lie;i++)
					str[j][i] = rs.getString(i);
		} catch (Exception e) {
			System.err.println("初始化数据失败：ERROR：ResultSet！");
		}
    }
    //获取数据的二维数组
    public String [][]getStr(){
        try{
            return str;
        }catch (Exception e){
            return null;
        }
    }
    //获取数据
    public String getString(String columnLable){
        int tmpRow=-1;
        for(int i=0;i<lie;i++)
            if(str[0][i].equals(columnLable))
                tmpRow=i;
        if(tmpRow==-1)return null;
        else try {
            return str[readRow][tmpRow];
        }catch (Exception e){
            return  null;
        }
    }
    public String getString(int column){
        try {
            return str[readRow][column];
        }catch (Exception e){
            return null;
        }
    }
    //获取整形数据
    public int getInt(String columnLable){
        int tmpRow=0;
        for(int i=0;i<lie;i++)
            if(str[0][i].equals(columnLable))
                tmpRow=i;
        try{
            return Integer.parseInt(str[readRow][tmpRow]);
        }catch (Exception e){
            return -1;
        }
    }
    public int getInt(int column){
        try {
            return Integer.parseInt(str[readRow][column]);
        }catch (Exception e){
            return -1;
        }
    }
    //获取浮点型数据
    public float getFloat(String columnLable){
        int tmpRow=0;

        for(int i=0;i<lie;i++)
            if(str[0][i].equals(columnLable))
                tmpRow=i;
        try {
            return Float.parseFloat(str[readRow][tmpRow]);
        }catch (Exception e){
            return -1;
        }
    }
    public float getFloat(int column){
        try {
            return Float.parseFloat(str[readRow][column]);
        }catch (Exception e){
            return -1;
        }
    }
    //搜索数据
    public ResultSaver search(String point,String condition){
        ResultSaver newRs=new ResultSaver();
        int newHang=0;
        this.beforFirst();
        while(this.next())if(this.getString(point).equals(condition))newHang++;
        String[][] newStr=new String[newHang][lie];
        this.beforFirst();
        newStr[0]=this.str[0];
        for(int i=1;this.next();)
            if(this.getString(point).equals(condition)){
                newStr[i]=this.str[readRow];
                i++;
            }
        newRs.setSourse(newHang, lie, newStr);
        return newRs;
    }
    //修改数据
    public boolean updataData(int column,String newData){
    	try {
        	str[readRow][column] = newData;
        	return true;
		} catch (Exception e) {
			return false;
		}
    }
    public boolean updataData(String columnLable,String newData){
    	int tmpRow=-1;
        for(int i=0;i<lie;i++)
            if(str[0][i].equals(columnLable))
                tmpRow=i;
        if(tmpRow==-1)return false;
        else try {
            str[readRow][tmpRow] = newData;
            return true;
        }catch (Exception e){
            return  false;
        }
    }
    //下一条数据
    public boolean next(){
        readRow++;
        if(readRow>hang) return false;
        else return true;
    }
    //至顶
    public void beforFirst(){
        readRow=0;
    }
    //初始化
    public void first(){
        readRow=1;
    }
}
