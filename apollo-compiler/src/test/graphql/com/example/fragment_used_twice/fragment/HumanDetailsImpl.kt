// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_used_twice.fragment

import com.apollographql.apollo.api.Fragment
import kotlin.Any
import kotlin.String

/**
 * A humanoid creature from the Star Wars universe
 */
interface HumanDetailsImpl : HumanDetail, Fragment.Data {
  override val __typename: String

  data class CharacterHumanDetailsImpl(
    override val __typename: String,
    /**
     * What this human calls themselves
     */
    override val name: String,
    /**
     * The date character was born.
     */
    override val birthDate: Any
  ) : HumanDetail, HumanDetail.Character, CharacterDetail, HumanDetailsImpl

  data class OtherHumanDetailsImpl(
    override val __typename: String,
    /**
     * What this human calls themselves
     */
    override val name: String
  ) : HumanDetail, HumanDetailsImpl
}
