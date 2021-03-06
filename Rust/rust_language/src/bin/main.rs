/*
The Rust Programming Language

Goes over the main features of Rust
Portions of Code and Definitions may be from:
    1. Rust Programming Language Book
        https://doc.rust-lang.org/book/2018-edition/ch00-00-introduction.html
    2. The Rust Standard Library Documentation
        https://doc.rust-lang.org/std/index.html
    3. The Little Book of Rust Macros
        https://danielkeep.github.io/tlborm/book/README.html
    4. Rust in Detail: Writing Scalable Chat Service from Scratch
        https://nbaksalyar.github.io/2015/07/10/writing-chat-in-rust.html
    5. Rust rosetta - Simple and complex tasks in Rust
        https://github.com/Hoverbear/rust-rosetta
   6. Programming Rust (book). Code available on GitHub
        https://github.com/ProgrammingRust/examples

The main.rs file is where the main function resides and is the
start of program execution.

Directories are organized into modules defined by
their name. Below are the list of modules with the mod
keyword for their names.

Most of the code resides in each of these modules.
In order to use this code in the actual program they
must be called in the main function. There are a few modules
enclosed in other modules and are not available to use
unless a pub keyword is added where needed.
*/
#![allow(dead_code)] // Allow dead code across entire crate
#![allow(unused_variables)] // Allow unused variables across entire cate
#![feature(try_trait)] // Use the try trait.

// Modules for the different language features of Rust
mod advanced_lifetimes; // Advanced feature
mod advanced_traits; // Advanced feature
mod advanced_types;
mod arrays_tuples;
mod automated_testing;
mod borrowing_references;
mod closures_iterators;
mod collection_types;
mod command_line;
mod concurrency;
mod enum_types;
mod file_io;
mod generics_traits_lifetimes;
mod handling_errors;
mod implementing_common_traits;
mod input_output_variables;
mod loops_matching;
mod match_expressions_patterns;
mod networking;
mod ownership;
mod ownership_lifetimes;
mod ownership_moves;
mod ownership_ref_deref;
mod smart_pointers;
mod sorting;
mod state_pattern;
mod string_types_chars;
mod trait_object_multi_types;
mod traits_built_in;
mod unsafe_rust; // Advanced feature
mod using_crates;
mod vectors; // Advanced feature

#[macro_use]
mod macro_usage; // Macros
extern crate reqwest;

// Main method
// Functions/Methods start with fn and use snake casing, where
// methods with two words are separated by an underline and
// are all lowercase.
fn main() {
    // Basic print statement with common Hello World!.
    println!("Hello, world!");
}
