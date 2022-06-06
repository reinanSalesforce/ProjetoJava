package projetoEscola;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TurmaCarga {

	public static void main(String[] args) {
		try{
			String url = "jdbc:mysql://localhost/escola";
			String user = "Reinan";
			String pass = "210820";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			cn.setAutoCommit(false);
			System.out.println("Connection successfully established!");
			
			PreparedStatement pStmt = cn.prepareStatement("insert into turma values(?,?)");			
			
			//	Change parameter to any keyword desired, if a record
			// 	matches the query then it will be displayed
			pStmt.setInt(1, 1);
			pStmt.setString(2,"TURMA-MANHA");
			int rows = pStmt.executeUpdate();
			cn.commit();
			System.out.println(rows + " row(s) added!");
			
			// segundo registro
			pStmt.setInt(1, 2);
			pStmt.setString(2,"TURMA-TARDE");
			rows = pStmt.executeUpdate();
			cn.commit();
			System.out.println(rows + " row(s) added!");
			
			// segundo registro
			pStmt.setInt(1, 3);  
			pStmt.setString(2,"TURMA-NOITE");
			rows = pStmt.executeUpdate();
			cn.commit();
			System.out.println(rows + " row(s) added!");
			
			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
			
			//Teste Fork - PR
		}	

	}
}
