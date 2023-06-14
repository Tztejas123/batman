package conditionalstatements;
/*Java has the following conditional statements:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed*/
/*if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}*/

public class ifstatements {//Yellow colors shows code is dead//
	public static void main(String[] args) {
		if (20 > 15) {
			  System.out.println("20 is greater than 18");
		}else {
			System.out.println("20 is less than 25");
		}
	}
}/*To change dead code to live code, you need to identify the dead code in your codebase and modify
 it or remove it accordingly. Here are the steps you can follow:

1. Identify dead code: Dead code refers to the portions of your codebase that are no longer executed 
or have become redundant. This could be due to changes in requirements, refactoring, or simply unused
 variables, functions, or blocks of code. Review your codebase thoroughly to identify such sections.

2. Understand the purpose: Before making any changes, make sure you understand the purpose of the dead
 code. It's possible that the code was intentionally left unused but serves as documentation or reference
  for future development. If you determine it's truly dead and unnecessary, proceed to the next step.

3. Remove unused code: If the dead code consists of unused variables, functions, or entire code blocks,
 you can safely remove them. However, be cautious when removing code, especially if it's intertwined with
  other parts of your codebase. Make sure to double-check the code's impact on other sections and consider
   running tests to ensure the removal doesn't introduce any issues.

4. Refactor and restructure: Sometimes, dead code may indicate areas of your codebase that need refactoring
 or restructuring. Take this opportunity to improve the quality of your code. Consider extracting reusable
  functions or classes, removing duplication, and improving overall code readability and maintainability.

5. Test thoroughly: After making changes, it's crucial to run tests to verify that your modifications haven't
 introduced any regressions or functional issues. Automated tests, such as unit tests or integration tests, can
  help ensure that your code behaves as expected.

6. Document your changes: If the dead code was removed, update the relevant documentation or comments to reflect
 the changes. This ensures that future developers understand the codebase accurately and can avoid reintroducing dead code.

7. Version control: If you're using version control, commit your changes after removing or modifying the dead code.
 This allows you to track the changes and easily revert them if needed.
By following these steps, you can effectively change dead code to live code, improving the maintainability and readability
 of your codebase while reducing unnecessary clutter.*/