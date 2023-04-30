package starter.duckduckgo;

import net.serenitybdd.core.steps.UIInteractions;

public class SearchActions extends UIInteractions{

	public void byKeyword(String keyword) {
		$("#search_from_input_homepage").sendKeys(keyword);
		$(".searcg__button").click();
	}
}
