/*
 * Selling Partner API for Listings Items
 * The Selling Partner API for Listings Items (Listings Items API) provides programmatic access to selling partner listings on Amazon. Use this API in collaboration with the Selling Partner API for Product Type Definitions, which you use to retrieve the information about Amazon product types needed to use the Listings Items API.  For more information, see the [Listing Items API Use Case Guide](doc:listings-items-api-v2020-09-01-use-case-guide).
 *
 * OpenAPI spec version: 2020-09-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.blueo.pis.amazonsdk.client.api;

import com.blueo.pis.amazonsdk.client.ApiException;
import com.blueo.pis.amazonsdk.model.listings.ListingsItemPatchRequest;
import com.blueo.pis.amazonsdk.model.listings.ListingsItemPutRequest;
import com.blueo.pis.amazonsdk.model.listings.ListingsItemSubmissionResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for ListingsApi
 */
@Ignore
public class ListingsApiTest {

    private final ListingsApi api = new ListingsApi();

    
    /**
     * 
     *
     * Delete a listings item for a selling partner.  **Note:** The parameters associated with this operation may contain special characters that must be encoded to successfully call the API. To avoid errors with SKUs when encoding URLs, refer to [URL Encoding](https://developer-docs.amazon.com/sp-api/docs/url-encoding).  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteListingsItemTest() throws ApiException {
        String sellerId = null;
        String sku = null;
        List<String> marketplaceIds = null;
        String issueLocale = null;
        ListingsItemSubmissionResponse response = api.deleteListingsItem(sellerId, sku, marketplaceIds, issueLocale);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Partially update (patch) a listings item for a selling partner. Only top-level listings item attributes can be patched. Patching nested attributes is not supported.  **Note:** The parameters associated with this operation may contain special characters that must be encoded to successfully call the API. To avoid errors with SKUs when encoding URLs, refer to [URL Encoding](https://developer-docs.amazon.com/sp-api/docs/url-encoding).  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchListingsItemTest() throws ApiException {
        String sellerId = null;
        String sku = null;
        List<String> marketplaceIds = null;
        ListingsItemPatchRequest body = null;
        String issueLocale = null;
        ListingsItemSubmissionResponse response = api.patchListingsItem(sellerId, sku, marketplaceIds, body, issueLocale);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates a new or fully-updates an existing listings item for a selling partner.  **Note:** The parameters associated with this operation may contain special characters that must be encoded to successfully call the API. To avoid errors with SKUs when encoding URLs, refer to [URL Encoding](https://developer-docs.amazon.com/sp-api/docs/url-encoding).  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values than those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putListingsItemTest() throws ApiException {
        String sellerId = null;
        String sku = null;
        List<String> marketplaceIds = null;
        ListingsItemPutRequest body = null;
        String issueLocale = null;
        ListingsItemSubmissionResponse response = api.putListingsItem(sellerId, sku, marketplaceIds, body, issueLocale);

        // TODO: test validations
    }
    
}
