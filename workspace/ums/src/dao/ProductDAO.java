package dao;

import java.util.HashSet;

import dto.ProductDTO;

public class ProductDAO {
	DBConnection conn = null;
	public ProductDAO() {
		conn=new DBConnection("ProductDB.txt");
	}
	public void addProd(ProductDTO product) {
		//전에 만들어놓은 insert 메소드 재사용
		//product의 toString을 넘겨주면 파일에 쓴다.
		conn.insert(product.toString());
	}
	public HashSet<ProductDTO> showAll(String userid) {
		//ProductDB.txt에는 마지막 방에 올린 유저의 id가 저장되어있다.
		//따라서 4번방에서 현재 세션의 id와 같은 값을 가지고있는 줄은 그 유저가 올린
		//상품의 정보라는 뜻이다.
		return conn.selectProduct(4, userid);
	}
	public void deleteProd(String data) {
		//삭제할 상품의 toString 문자열 그대로 받아와서
		//아까 만들어놓은 delete메소드에 넘겨주면 끝
		conn.delete(data);
	}
	public void updateProd(ProductDTO product,int index,String newData) {
		//상품, 수정할 위치, 새로운 정보 를 받아와서 현재 로그인 되어있는 session까지
		//updateProduct()에 같이 넘겨준다.
		conn.updateProduct(UserDAO.session,product, index, newData);
	}
}








