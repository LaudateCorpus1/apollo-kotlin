// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.named_fragment_delegate.fragment

import com.apollographql.apollo.api.Fragment
import kotlin.Any
import kotlin.String
import kotlin.collections.List

/**
 * A humanoid creature from the Star Wars universe
 */
data class HumanDetailsImpl(
  override val __typename: String = "Human",
  /**
   * What this human calls themselves
   */
  override val name: String,
  /**
   * Profile link
   */
  override val profileLink: Any,
  /**
   * The friends of the human exposed as a connection with edges
   */
  override val friendsConnection: FriendsConnection
) : HumanDetail, Fragment.Data {
  /**
   * A connection object for a character's friends
   */
  data class FriendsConnection(
    /**
     * The edges for each of the character's friends.
     */
    override val edges: List<Edge?>?
  ) : HumanDetail.FriendsConnection {
    /**
     * An edge object for a character's friends
     */
    data class Edge(
      /**
       * The character represented by this friendship edge
       */
      override val node: Node?
    ) : HumanDetail.FriendsConnection.Edge {
      /**
       * A character from the Star Wars universe
       */
      data class Node(
        /**
         * The name of the character
         */
        override val name: String
      ) : HumanDetail.FriendsConnection.Edge.Node
    }
  }
}
