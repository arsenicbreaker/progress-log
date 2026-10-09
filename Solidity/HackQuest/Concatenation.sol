// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract StringExample {
  string public greeting = "Hello, ";
  string public name = "Alice";
    
  string result = string.concat(greeting, name);
    
  string public message;
  function setMessage() public {
    message = string.concat("Hello, ", name);
  }
}