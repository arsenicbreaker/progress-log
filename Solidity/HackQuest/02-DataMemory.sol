// SPDX-License-Identifier: MIT
pragma solidity ^0.8.4;

contract MemoryExample {
  string public name;
  uint public score;
  
  function operate() public {
    score = 10;
    name = "Jane";

    // tempName is a temporary variable stored in memory
    string memory tempName = "Joe";
    tempName = name;
  }
}

//memory is less expensive than storage