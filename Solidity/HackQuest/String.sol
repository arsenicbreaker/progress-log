// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract LearningStrings {
  string car = "BMW";
  string text;
  //assign a value to a string variable using the function
  function setText () public returns (string memory) {
    text = "Hello World";
    return text;
  }
}