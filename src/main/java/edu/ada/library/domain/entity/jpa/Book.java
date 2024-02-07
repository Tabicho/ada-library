package edu.ada.library.domain.entity.jpa;

import java.util.Objects;

import org.hibernate.proxy.HibernateProxy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "book", uniqueConstraints = {@UniqueConstraint(columnNames = {"title", "author"})})
public class Book {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String isbn;
    private int availableCopies;
	
    
	@Override
	  public final boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null) return false;
	    Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
	    Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
	    if (thisEffectiveClass != oEffectiveClass) return false;
	    Book book = (Book) o;
	    return getId() != null && Objects.equals(getId(), book.getId());
	  }
	
	  @Override
	  public final int hashCode() {
	    return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
	  }
    
}
