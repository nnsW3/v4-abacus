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
 * Values: OPEN,FILLED,CANCELED,BEST_EFFORT_CANCELED,UNTRIGGERED
 */
@JsExport
@Serializable
enum class IndexerOrderStatus(val value: kotlin.String) {
    OPEN("OPEN"), // :/
    FILLED("FILLED"), // :/
    CANCELED("CANCELED"), // :/
    BEST_EFFORT_CANCELED("BEST_EFFORT_CANCELED"), // :/
    UNTRIGGERED("UNTRIGGERED"); // :/
}
