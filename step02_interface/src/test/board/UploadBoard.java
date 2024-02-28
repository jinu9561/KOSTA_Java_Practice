package test.board;

// �ڷ�� �Խ��� �Ӽ����� ��ü

public class UploadBoard extends Board {
	
	private String fileName;
	
	UploadBoard(){}

	public UploadBoard(String fileName) {
		super();
		this.fileName = fileName;
	}


	public UploadBoard(int bno, String subject, String writer, String content, String fileName) {
		super(bno, subject, writer, content);
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", ");
		builder.append("fileName=");
		builder.append(fileName);
		builder.append("]");
		return builder.toString();
	}
	

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
