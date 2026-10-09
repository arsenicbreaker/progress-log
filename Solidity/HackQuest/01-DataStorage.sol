// every refrence has an additional annotation that is data lotaction there are three options: storage, memory, and calldata. storage is persisted on the Ethereum blockchain. (used to store long-term state variables in contracts)

// SPDX-License-Identifier: MIT
pragma solidity ^0.8.4;

contract StorageExample {
  string name = "hello"; //this string state variable is in storage
  function update() public {
    name = "hello~";
  }
}