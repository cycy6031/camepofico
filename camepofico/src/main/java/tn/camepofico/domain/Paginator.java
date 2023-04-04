package tn.camepofico.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Paginator {
	private int page = 1;
	private int totalCount;
	private int size = 10;
	private int startNum;
	private long totalPage;
	private int foreachStart;
	private int foreachEnd;
	private String searchKey = "p.PS_SUBJECT";
	private String searchValue = "";

	public Paginator(int page, int size, int totalCount) {
		this.page = page;
		this.totalCount = totalCount;
		this.size = size;
		this.totalPage = (int)Math.ceil(totalCount/size);
		forEachStartAndEnd();
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		this.startNum = (size * (page-1));
		this.totalPage = (int)Math.ceil(totalCount/size);
		forEachStartAndEnd();
	}

	private void forEachStartAndEnd() {
		foreachStart = 1;
		foreachEnd = (int)totalPage;
		if (page<=5 && totalPage>10) {
			foreachEnd = 10;
		} else if (page > 5 && totalPage - page >= 5) {
			foreachStart = page - 4;
			foreachEnd = page + 5;
		} else if (page > 5 && totalPage > 9 && totalPage - page < 5) {
			foreachStart = (int) totalPage - 9;
			foreachEnd = (int) totalPage;
		}
	}
}