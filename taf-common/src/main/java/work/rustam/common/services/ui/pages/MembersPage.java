package work.rustam.common.services.ui.pages;

import org.springframework.stereotype.Service;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

@Service
public class MembersPage {

	public List<String> getMembers ()
	{
		switchTo().innerFrame("TPASection_jxuhagasiframe");
		return $$x("//button[@data-hook='memberBox.name']").texts();
	}

	public void search (String name)
	{
		switchTo().innerFrame("TPASection_jxuhagasiframe");
		$x("//input[@placeholder='Find a member...']").sendKeys(name);
	}
}
