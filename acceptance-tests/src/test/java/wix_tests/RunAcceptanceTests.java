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
package wix_tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static com.codeborne.selenide.WebDriverRunner.isIE;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"},
		junit = {"--filename-compatible-names"},
		tags = {"not @Ignore", "not @InDev"}
)

public class RunAcceptanceTests {

	@AfterClass
	public static void ieRelax() {
		if (isIE()) {
			closeWebDriver();
			sleep(500);
		}
	}
}
