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
 * @param clobPairId
 * @param ticker
 * @param status
 * @param oraclePrice
 * @param priceChange24H
 * @param volume24H
 * @param trades24H
 * @param nextFundingRate
 * @param initialMarginFraction
 * @param maintenanceMarginFraction
 * @param openInterest
 * @param atomicResolution
 * @param quantumConversionExponent
 * @param tickSize
 * @param stepSize
 * @param stepBaseQuantums
 * @param subticksPerTick
 * @param marketType
 * @param openInterestLowerCap
 * @param openInterestUpperCap
 * @param baseOpenInterest
 */
@JsExport
@Serializable
data class IndexerPerpetualMarketResponseObject(

    val clobPairId: kotlin.String? = null,
    val ticker: kotlin.String? = null,
    val status: IndexerPerpetualMarketStatus? = null,
    val oraclePrice: kotlin.String? = null,
    val priceChange24H: kotlin.String? = null,
    val volume24H: kotlin.String? = null,
    val trades24H: kotlin.Int? = null,
    val nextFundingRate: kotlin.String? = null,
    val initialMarginFraction: kotlin.String? = null,
    val maintenanceMarginFraction: kotlin.String? = null,
    val openInterest: kotlin.String? = null,
    val atomicResolution: kotlin.Int? = null,
    val quantumConversionExponent: kotlin.Int? = null,
    val tickSize: kotlin.String? = null,
    val stepSize: kotlin.String? = null,
    val stepBaseQuantums: kotlin.Int? = null,
    val subticksPerTick: kotlin.Int? = null,
    val marketType: IndexerPerpetualMarketType? = null,
    val openInterestLowerCap: kotlin.String? = null,
    val openInterestUpperCap: kotlin.String? = null,
    val baseOpenInterest: kotlin.String? = null
)