## Introduction
A simple version of wc unix tool that reads either standard input or computer files and generates one or more of the following statistics: newline count, word count, and byte count, This tool follows the Unix philosophies, providing simple parts connected by clean interfaces and designed to be easily connected to other programs.

This challenge is a part of the coding challenges given by John Crickett: https://codingchallenges.fyi/challenges/intro

Challenge Link: https://codingchallenges.fyi/challenges/challenge-wc

## Prerequisites

- Java: version 8 or more

## Features

ccwc provides the following counts:

- **Word Count:** `-w` or `--words`
- **Line Count:** `-l` or `--lines`
- **Character Count:** `-m` or `--chars`
- **Byte Count:** `-c` or `--bytes`

## How to Use

1. Run the command: `ccwc <option> <file1>`
2. Use stdin with pipes: `cat filename | ccwc -<option>`

## Sample Command

```bash
ccwc -w -l -c test.txt
```
