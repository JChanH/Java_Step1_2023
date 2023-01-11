package chapter04;

public class book {// jvm에서만 존재하는 data // custom 해준다

	public String bookname; // 맴버변수 (모든 bookname이 저장되는곳)
	public String author; //

	// 디폴트 생성자 (book이라는 클라스를 불러왔을때 어떤 매게변수와 타입을 정해서 넣어줄지 설정
	// overloading을 하여 book 클래스에 저장될 매게변수의 수 타입을 다르게 설정 가능하다
	public book() {
	}
	public book(String bookname, String author) {
		this.bookname = bookname; // this. 해당 클래스의 원형
		this.author = author;
	}

	// =========================================================================================//
	public String getBookname() { //
		return bookname; // 불러주는 곳에 bookname을 던저준다 (다만 초기화가 되어 있어야 한다)
	}

	public void setBookname(String bookname) {
		this.bookname = bookname; // 다른곳에서 불러오는 경우 set을 사용한다
	}

	public String getAuthor() { //String은 return되는 값의 타입
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// 밖에서 불러오는것을 get
	// set == 밖에서 초기화 해서 들여오는것

	// 사용자 정의 //public으로 지정하여 어디서든 접근 가능한 상태임
	public void showBookinfo() { // void는 저장하지 않고 바로 뿌려주는 경우에 사용
		System.out.println("책이름 :" + bookname + "| 저자 : " + author);
	}
}
