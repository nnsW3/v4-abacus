/**
 * Indexer API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package indexer.codegen

import kotlinx.serialization.Serializable
import kotlin.js.JsExport

/**
 *
 * @param address
 * @param parentSubaccountNumber
 * @param equity
 * @param freeCollateral
 * @param childSubaccounts
 */
@JsExport
@Serializable
data class IndexerParentSubaccountResponse(

    val address: kotlin.String? = null,
    val parentSubaccountNumber: kotlin.Int? = null,
    val equity: kotlin.String? = null,
    val freeCollateral: kotlin.String? = null,
    val childSubaccounts: kotlin.Array<IndexerSubaccountResponseObject>? = null
)