package innerclass;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EX5 {

	public static void main(String[] args) {
		
		// 1. 화면 만들기
		Frame frame = new Frame(); // 프레임 선언
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		frame.setVisible(true);
		Button button = new Button("Click");
		frame.add(button);
		
		// 2. 버튼 이벤트 등록하기
//		button.addActionListener(new EvertHandler());
		
		// 3. 익명 클래스로 버튼 이벤트 등록하기
		button.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 클릭했습니다!");
			}
		});
		
	}
}

// 클래스로 인터페이스 구현하기
class EvertHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 클릭했습니다!");
	}
	
}