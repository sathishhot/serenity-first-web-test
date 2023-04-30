package starter.duckduckgo;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenSearchingByKeyword {
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	NavigateActions navigate;
	SearchActions search;
	SearchResultSidebar searchResultSidebar;
	

	@Test
	void theKeywordShouldAppearInTheResultSidebar() {
		
		navigate.toTheDuckDuckGoSearchPage();
		search.byKeyword("Cucumber");
		
		Serenity.reportThat("Cucumber Found",
				() -> assertThat(searchResultSidebar.heading()).isEqualTo("Cucumber")
				);
			}


}
