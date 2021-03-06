/*******************************************************************************
 * Copyright 2012 Agorava
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package org.agorava.linkedin;

import java.util.List;

import org.agorava.linkedin.model.Companies;
import org.agorava.linkedin.model.Company;
import org.agorava.linkedin.model.Products;

/**
 * Operations related to Companies on LinkedIn
 * 
 * @author Robert Drysdale
 * @author Antoine Sabot-Durand
 */
public interface CompanyService {

    /**
     * Retrieve Company Details based on unique integer id
     * 
     * @param id
     * @return company
     */
    Company getCompany(int id);

    /**
     * Retrieve Company Details based on unique name id
     * 
     * @param name
     * @return company
     */
    Company getCompanyByUniversalName(String name);

    /**
     * Retrive List of Company Details based on email domain
     * 
     * @param domain Email Domain
     * @return List of Companies
     */
    List<Company> getCompaniesByEmailDomain(String domain);

    /**
     * Search of Companies based on space separated list of keywords
     * 
     * @param keywords
     * @return Search Result with count, start, total and list of companies
     */
    Companies search(String keywords);

    /**
     * Retrieve list of Companies that user is following
     * 
     * @return List of Companies
     */
    List<Company> getFollowing();

    /**
     * Retrieve a list of Suggested Companies for user to follow
     * 
     * @return List of Companies
     */
    List<Company> getSuggestionsToFollow();

    /**
     * Start following company
     * 
     * @param id
     */
    void startFollowingCompany(int id);

    /**
     * Stop following company
     * 
     * @param id
     */
    void stopFollowingCompany(int id);

    /**
     * Get products for a company.
     * 
     * @param companyId the ID of the company to get products for.
     * @param start The starting point in the result set. Used with count for pagination.
     * @param count The number of products to return. Used with start for pagination.
     * @return the products for the specified company.
     */
    Products getProducts(int companyId, int start, int count);

}
