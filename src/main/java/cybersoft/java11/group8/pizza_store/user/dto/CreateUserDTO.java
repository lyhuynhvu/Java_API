package cybersoft.java11.group8.pizza_store.user.dto;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import cybersoft.java11.group8.pizza_store.user.util.UserStatus;
import cybersoft.java11.group8.pizza_store.user.validation.annotation.UniqueUsername;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserDTO {
	@NotBlank (message = "{user.username.notblank}")
	@Size (min = 3, max = 50, message = "{user.username.size}")
	@Column (unique = true)
	@UniqueUsername
	private String username;
	
	@NotBlank(message = "{user.password.notblank}")
	private String password;
	
	@NotBlank(message = "{user.email.notblank}")
	@Email
	private String email;
	
	@NotBlank(message = "{user.fullname.notblank}")
	private String fullname;
	
	@NotBlank(message = "{user.displayname.notblank}")
	private String displayname;
	
	private String avatar;
	
	@NotNull (message = "{user.status.notnull}")
	@Enumerated(EnumType.STRING)
	private UserStatus status;

}
