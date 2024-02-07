package edu.ada.library.domain.entity.jpa;

import java.util.Collection;
import java.util.Objects;

import org.hibernate.proxy.HibernateProxy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "user")
public class User implements UserDetails{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private static final long serialVersionUID = 1L;
	private String name, lastName;
	private String email;
	private String password;
	private Boolean enable;
	
	@Override
	  public final boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null) return false;
	    Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
	    Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
	    if (thisEffectiveClass != oEffectiveClass) return false;
	    User user = (User) o;
	    return getId() != null && Objects.equals(getId(), user.getId());
	  }
	
	  @Override
	  public final int hashCode() {
	    return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
	  }

	  @Override
	  public String getUsername() {
	    return this.email;
	  }

	  @Override
	  public String getPassword() {
	    return this.password;
	  }

	  @Override
	  public boolean isAccountNonExpired() {
	    return true;
	  }

	  @Override
	  public boolean isAccountNonLocked() {
	    return true;
	  }

	  @Override
	  public boolean isCredentialsNonExpired() {
	    return true;
	  }

	  @Override
	  public boolean isEnabled() {
	    return this.enable;
	  }
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
