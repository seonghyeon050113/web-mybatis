package com.web.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {
	private int biNum;
	private String biTitle;
	private String biContent;
	private int uiNum;
	private String credat;
	private String cretim;
	private String uiName;
	private String biPath;
}
