package edu.ada.library.domain.dto;

import java.sql.Date;

import edu.ada.library.domain.entity.jpa.Book;
import edu.ada.library.domain.entity.jpa.User;

public record BorrowDto(

		 Long id,
		 Book book,		
		 User user,
		 Date initDate,
		 Date endDate
		
) {

}
