package controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import dao.UserDAO;
import model.Sexo;
import model.User;

@Named
@ViewScoped
public class UserController extends Controller<User> implements Serializable{
	
private static final long serialVersionUID = -3955368378894625110L;
	
	public UserController() {
		super(new UserDAO());
	}

	@Override
	public User getEntity() {
		if (entity == null)
			entity = new User();
		return entity;
	}
	
	public Sexo[] getListaSexo() {
		return Sexo.values();
	}


}
