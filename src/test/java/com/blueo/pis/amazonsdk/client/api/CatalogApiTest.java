/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, refer to the [Catalog Items API Use Case Guide](doc:catalog-items-api-v2022-04-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-04-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.blueo.pis.amazonsdk.client.api;

import com.blueo.pis.amazonsdk.client.ApiException;
import com.blueo.pis.amazonsdk.client.model.ErrorList;
import com.blueo.pis.amazonsdk.client.model.Item;
import com.blueo.pis.amazonsdk.client.model.ItemSearchResults;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CatalogApi
 */
@Ignore
public class CatalogApiTest {

    private final CatalogApi api = new CatalogApi();

    
    /**
     * 
     *
     * Retrieves details for an item in the Amazon catalog.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 2 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may observe higher rate and burst values than those shown here. For more information, refer to the [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCatalogItemTest() throws ApiException {
        String asin = null;
        List<String> marketplaceIds = null;
        List<String> includedData = null;
        String locale = null;
        Item response = api.getCatalogItem(asin, marketplaceIds, includedData, locale);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Search for and return a list of Amazon catalog items and associated information either by identifier or by keywords.  **Usage Plans:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2 | 2 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may observe higher rate and burst values than those shown here. For more information, refer to the [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchCatalogItemsTest() throws ApiException {
        List<String> marketplaceIds = null;
        List<String> identifiers = null;
        String identifiersType = null;
        List<String> includedData = null;
        String locale = null;
        String sellerId = null;
        List<String> keywords = null;
        List<String> brandNames = null;
        List<String> classificationIds = null;
        Integer pageSize = null;
        String pageToken = null;
        String keywordsLocale = null;
        ItemSearchResults response = api.searchCatalogItems(marketplaceIds, identifiers, identifiersType, includedData, locale, sellerId, keywords, brandNames, classificationIds, pageSize, pageToken, keywordsLocale);

        // TODO: test validations
    }
    
}
