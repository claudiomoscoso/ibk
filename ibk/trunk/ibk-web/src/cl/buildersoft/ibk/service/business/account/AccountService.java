package cl.buildersoft.ibk.service.business.account;

import java.util.List;

import cl.buildersoft.ibk.bean.Account;
import cl.buildersoft.ibk.bean.Movement;

public interface AccountService {
	public List<Movement> listMovement(Account account);
}
