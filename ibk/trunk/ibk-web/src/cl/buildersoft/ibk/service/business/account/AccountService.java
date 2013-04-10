package cl.buildersoft.ibk.service.business.account;

import java.util.List;

import cl.buildersoft.ibk.bean.business.Account;
import cl.buildersoft.ibk.bean.business.Movement;

public interface AccountService {
	public List<Movement> listMovement(Account account);
}
