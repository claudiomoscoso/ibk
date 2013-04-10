package cl.buildersoft.ibk.service.plataform.config;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cl.buildersoft.ibk.bean.plataform.Group;
import cl.buildersoft.ibk.bean.plataform.Value;

public interface ConfigService {
	public Group getGroup(HttpServletRequest request, String key);

	public List<Group> listGroups(HttpServletRequest request);

	public Value getValue(HttpServletRequest request, Group group, String key);

}
