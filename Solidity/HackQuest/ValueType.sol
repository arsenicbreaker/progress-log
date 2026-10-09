// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract Example {
  mapping(int256 => address) map;

  function types() public {
    uint256 a = 1;
    uint256 b = a;
    a = 2; //a is updated, but b stays the same
    b = 4; //b is updated, but a stays the same

    map[1] = address(0x123);
  }
}

// Create a value type variable named num of type uint with a value of 66.
contract Variables {
    uint num = 66;
  function doSomething() public {
    num = 88;
  }
}