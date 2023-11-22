package question09;

interface DataAccessObject {
	public void select();
	public void insert();
	public void update();
	public void delete();
	
	}
class OracleDao implements DataAccessObject{
	public static String name = "Oracle DB"; 
	@Override
	public void select() {
		System.out.println(name+"에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println(name+"에서 삽입");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		System.out.println(name+"에서 수정");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		System.out.println(name+"에서 삭제");
		// TODO Auto-generated method stub
		
	}
	
	
}
class MySqlDao implements DataAccessObject{
	public static String name = "Mysql DB"; 
	@Override
	public void select() {
		System.out.println(name+"에서 검색");
		
	}
	
	@Override
	public void insert() {
		System.out.println(name+"에서 삽입");
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update() {
		System.out.println(name+"에서 수정");
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void delete() {
		System.out.println(name+"에서 삭제");
		// TODO Auto-generated method stub
		
	}
	
	
}


public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.delete();
		dao.update();
	}
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		
		
	}
	

}
