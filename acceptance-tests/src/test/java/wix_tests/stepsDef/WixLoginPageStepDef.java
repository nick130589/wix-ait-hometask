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
package wix_tests.stepsDef;

import org.springframework.beans.factory.annotation.Value;

import cucumber.api.java.en.Given;
import work.rustam.common.utils.helpers.RandomUtils;


public class WixLoginPageStepDef extends AbstractStepsDef {

	@Value("${ui.baseUrl}")
	String baseUrl;

	@Value("${email}")
	String email;

	@Value("${password}")
	String password;

	@Given("^User open Wix Login page$")
	public void openHomePage() {
		loginPage.login(baseUrl, String.format(email, RandomUtils.getRandomNumber()), password);
	}
}

