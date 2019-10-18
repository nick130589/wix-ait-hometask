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

import work.rustam.common.services.ui.pages.GoogleResultsPage;
import work.rustam.common.services.ui.pages.GoogleStartPage;
import work.rustam.common.services.ui.pages.LoginPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import work.rustam.common.services.ui.pages.MembersPage;
import work.rustam.common.services.ui.pages.ProfilePage;

public class AbstractStepsDef {


	@Value("${ui.baseUrl}")
	String baseUrl;

	@Value("${env.name}")
	public String environment;

	@Autowired
	@Lazy
	public LoginPage loginPage;

	@Autowired
	@Lazy
	public ProfilePage profilePage;

	@Autowired
	@Lazy
	public MembersPage membersPage;

	@Autowired
	@Lazy
	public GoogleStartPage googleStartPage;

	@Autowired
	@Lazy
	public GoogleResultsPage googleResultsPage;
}
