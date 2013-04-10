package cl.buildersoft.ibk.service.plataform.config.mock;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.plataform.Group;
import cl.buildersoft.ibk.bean.plataform.Value;
import cl.buildersoft.ibk.service.plataform.config.ConfigService;

public class ConfigServiceImpl implements ConfigService {

	@Override
	public Group getGroup(HttpServletRequest request, String key) {

		return null;
	}

	@Override
	public List<Group> listGroups(HttpServletRequest request) {

		return null;
	}

	@Override
	public Value getValue(HttpServletRequest request, Group group, String key) {

		return null;
	}

}
