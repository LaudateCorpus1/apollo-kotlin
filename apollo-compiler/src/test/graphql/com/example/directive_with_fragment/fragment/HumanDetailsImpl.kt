// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.directive_with_fragment.fragment

import com.apollographql.apollo.api.Fragment
import kotlin.String

/**
 * A humanoid creature from the Star Wars universe
 */
data class HumanDetailsImpl(
  override val __typename: String = "Human",
  /**
   * The home planet of the human, or null if unknown
   */
  override val homePlanet: String?
) : HumanDetail, Fragment.Data
