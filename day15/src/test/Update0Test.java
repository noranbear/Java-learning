package test;

import dao.BookDao;
import frame.Dao;
import vo.BookVo;

/**
 * update0() Test
 * @author noranbear (norandoly@gmail.com)
 * @since 2022. 4. 27. ���� 2:39:29
 * @version 1.0
 */
public class Update0Test {

	public static void main(String[] args) {
		Dao<Integer, BookVo> dao = new BookDao();
		
		try {
			dao.update0(4);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
