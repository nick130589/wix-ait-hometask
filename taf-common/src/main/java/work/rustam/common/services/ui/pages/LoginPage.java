/*
 * Copyright 2002 - 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package work.rustam.common.services.ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

@Service
public class LoginPage {

	public void open(String baseUrl)
	{
		Selenide.open(baseUrl);
	}

	public void login(String email, String password)
	{
		$x("//span/ancestor::button").waitUntil(Condition.visible,5000).click();

		$("#signUpDialogswitchToEmailLink").click();


		$("#signUpDialogemailInputinput").sendKeys(email);
		$("#signUpDialogpasswordInputinput").sendKeys(password);

		$("#signUpDialogokButton").click();
		sleep(5000);
	}
}
