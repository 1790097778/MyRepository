package save;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultSaver {
    String str[][]=null;
    //��������
    int hang=0,lie=0;
    //��ʼ����
    int readRow=1;
    //��������
    public void setSourse(int hang,int lie,String sourse[][]){
        this.hang=hang;
        this.lie=lie;
        this.str=sourse;
    }
    
    public void setSourse(ResultSet rs){
		try {
			//��ȡ��
	    	ResultSetMetaData rsmd=rs.getMetaData();
	    	lie=rsmd.getColumnCount();
	    	//��ȡ��
	    	rs.beforeFirst();
			for(hang=0;rs.next();hang++);
			//�����ͷ
			str = new String[hang][lie];
			rs.beforeFirst();
			for(int i=1;i<=lie;i++)
				str[0][i] = rsmd.getColumnName(i);
			//��������
			for(int j=1;rs.next();j++)
				for(int i=1;i<=lie;i++)
					str[j][i] = rs.getString(i);
		} catch (Exception e) {
			System.err.println("��ʼ������ʧ�ܣ�ERROR��ResultSet��");
		}
    }
    //��ȡ���ݵĶ�ά����
    public String [][]getStr(){
        try{
            return str;
        }catch (Exception e){
            return null;
        }
    }
    //��ȡ����
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
    //��ȡ��������
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
    //��ȡ����������
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
    //��������
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
    //�޸�����
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
    //��һ������
    public boolean next(){
        readRow++;
        if(readRow>hang) return false;
        else return true;
    }
    //����
    public void beforFirst(){
        readRow=0;
    }
    //��ʼ��
    public void first(){
        readRow=1;
    }
}
