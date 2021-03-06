/*


LeetCode 从零单刷个人笔记整理（持续更新）
https://blog.csdn.net/qq_20304723/article/details/89401203

LeetCode
1.MinDepthofBintree					                2018.8.13	java
2.EvaluateReversePolishNotation		                2018.8.15	java
3.MaxPointsOnALine					                2018.8.19	java
4.AddTwoNumbers						                2019.2.15	java
5.MedianofTwoSortedArrays			                2019.2.17	java
6.LongestPalindromicSubstring		                2019.2.18	java
7.ReverseInteger					                2019.2.19	java
8.StringtoInteger					                2019.2.20	java
9.PalindromeNumber					                2019.2.21	java
10.ContainerWithMostWater			                2019.2.22	java
11.LongestCommonPrefix				                2019.2.23	java
12.PrefixTree						                2019.2.24	java
13.ThreeSum							                2019.2.24	java
14.ThreeSumClosest					                2019.2.25	java
15.ValidParentheses					                2019.2.26	java
16.MergeTwoSortedLists				                2019.2.27	java
17.MergekSortedLists				                2019.2.28	java
18.RemoveDuplicatesfromSortedArray	                2019.3.1	java
19.SearchinRotatedSortedArray		                2019.3.2	java
20.MultiplyStrings					                2019.3.3	java
21.Permutations						                2019.3.4	java
22.MaximumSubarray					                2019.3.5	java
23.SpiralMatrix						                2019.3.6	java
24.SpiralMatrix2					                2019.3.7	java
25.RotateList						                2019.3.8	java
26.UniquePaths                                      2019.3.12   java
27.ClimbingStairs                                   2019.3.13   java
28.Subsets                                          2019.3.14   java
29.CheapestFlightsWithinKStops                      2019.3.15   java
30.MergeSortedArray                                 2019.3.23   java
31.GrayCode                                         2019.4.1    java
32.BestTimetoBuyAndSellStock                        2019.4.1    java
33.BestTimetoBuyAndSellStockII                      2019.4.1    java
34.BestTimetoBuyAndSellStockIII                     2019.4.2    java
35.BinaryTreeMaximumPathSum                         2019.4.2    java
36.SingleNumber                                     2019.4.2    java
37.BurstBalloons                                    2019.4.3    java
38.LinkedListCycle                                  2019.4.4    java
39.MinimumNumberofRefuelingStops                    2019.4.7    java
40.CoinChange                                       2019.4.7    java
41.CoinChange2                                      2019.4.8    java
42.LRUCache                                         2019.4.9    java
43.SortList                                         2019.4.9    java
44.MinStack                                         2019.4.10   java
45.IntersectionofTwoLinkedLists                     2019.4.10   java
46.MajorityElementI & II                            2019.4.10   java
47.ReverseLinkedList                                2019.4.10   java
48.KthLargestElementInAnArray                       2019.4.11   java
49.ContainsDuplicate                                2019.4.11   java
50.KthSmallestElementInABST                         2019.4.11   java
51.PowerofTwo                                       2019.4.12   java
52.LowestCommonAncestor0fABinarySearchTree          2019.4.12   java
53.DeleteNodeInALinkedList                          2019.4.14   java
54.ProductOfArrayExceptSelf                         2019.4.15   java
55.NimGame                                          2019.4.15   java
56.ReverseString                                    2019.4.15   java
57.ReverseWordsInAStringIII                         2019.4.15   java
58.TwoSum                                           2019.4.16   java
59.LongestSubstringWithoutRepeatingCharacters       2019.4.18   java
60.RegularExpressionMatching                        2019.4.20   java
61.IntegerToRoman                                   2019.4.23   java
62.LetterCombinationsOfAPhoneNumber                 2019.4.24   java
63.RemoveNthNodeFromEndOfList                       2019.4.24   java
64.GenerateParentheses                              2019.4.24   java
65.ImplementstrStr                                  2019.4.25   java
66.DivideTwoIntegers                                2019.4.28   java
67.FindFirstAndLastPositionOfElementInSortedArray   2019.4.28   java
68.ValidSudoku                                      2019.4.30   java
69.CountAndSay                                      2019.5.3    java
70.FirstMissingPositive                             2019.5.6    java
71.TrappingRainWater                                2019.5.6    java
72.WildcardMatching                                 2019.5.6    java
73.RotateImage                                      2019.5.8    java
74.GroupAnagrams                                    2019.5.10   java
75.Pow                                              2019.5.13   java
76.JumpGame                                         2019.5.14   java
77.MergeIntervals                                   2019.5.24   java
78.PlusOne                                          2019.5.24   java
79.SqrtX                                            2019.5.24   java
80.SetMatrixZeroes                                  2019.5.24   java
81.SortColors                                       2019.5.26   java
82.MinimumWindowSubstring                           2019.5.28   java
83.WordSearch                                       2019.5.29   java
84.LargestRectangleInHistogram                      2019.5.30   java
85.DecodeWays                                       2019.5.31   java
86.BinaryTreeInorderTraversal                       2019.5.31   java
87.ValidateBinarySearchTree                         2019.5.31   java
88.SymmetricTree                                    2019.5.31   java
89.BinaryTreeLevelOrderTraversal                    2019.5.31   java
90.WordBreak                                        2019.6.3    java
91.ConstructBinaryTreeFromPreorderAndInorderTraversal   2019.6.6    java
92.BulbSwitcher                                     2019.6.7    java
93.ConvertSortedArrayToBinarySearchTree             2019.6.7    java
94.SortInArray                                      2019.6.8    java
95.PopulatingNextRightPointersInEachNode            2019.6.14   java
96.PascalTriangle                                   2019.6.16   java
97.ValidPalindrome                                  2019.6.17   java
98.WordLadder                                       2019.6.18   java
99.LongestConsecutiveSequence                       2019.6.19   java
100.SurroundedRegions                               2019.7.17   java
101.PalindromePartitioning                          2019.7.18   java
102.GasStation                                      2019.7.22   java
103.SwapNodesInPairs                                2019.7.22   java
104.PascalsTriangleII                               2019.7.22   java
105.FibonacciNumber                                 2019.7.22   java
106.KthSymbolInGrammar                              2019.7.23   java
107.CopyListWithRandomPointer                       2019.7.23   java
108.UniqueBinarySearchTrees                         2019.7.23   java
109.WordBreakII                                     2019.7.25   java
110.MaximumProductSubarray                          2019.7.26   java
111.FindPeakElement                                 2019.7.27   java
112.FractionToRecurringDecimal                      2019.7.28   java
113.ExcelSheetColumnNumber                          2019.7.29   java
114.FactorialTrailingZeroes                         2019.7.29   java
115.LargestNumber                                   2019.7.29   java
116.RotateArray                                     2019.7.30   java
117.ReverseBits                                     2019.7.30   java
118.NumberOf1Bits                                   2019.7.30   java
119.HouseRobber                                     2019.7.31   java
120.NumberOfIslands                                 2019.7.31   java
121.HappyNumber                                     2019.8.1    java
122.CountPrimes                                     2019.8.1    java
123.CourseSchedule                                  2019.8.1    java
124.WordSearchII                                    2019.8.2    java
125.TheSkylineProblem                               2019.8.5    java
126.BasicCalculatorII                               2019.8.6    java
127.PalindromeLinkedList                            2019.8.7    java
128.SlidingWindowMaximum                            2019.8.8    java
129.SearchA2DMatrixII                               2019.8.9    java
130.ValidAnagram                                    2019.8.10   java
131.MissingNumber                                   2019.8.11   java
132.PerfectSquares                                  2019.8.12   java
133.MoveZeroes                                      2019.8.13   java
134.FindTheDuplicateNumber                          2019.8.15   java
135.GameOfLife                                      2019.8.16   java
136.FindMedianFromDataStream                        2019.8.17   java
137.SerializeAndDeserializeBinaryTree               2019.8.18   java
138.LongestIncreasingSubsequence                    2019.8.19   java
139.CountOfSmallerNumbersAfterSelf                  2019.8.20   java
140.WiggleSortII                                    2019.8.21   java
141.PowerOfThree                                    2019.9.9    java
142.IncreasingTripletSubsequence                    2019.9.10   java
143.LongestIncreasingPathInAMatrix                  2019.9.12   java
144.FlattenNestedListIterator                       2019.9.14   java
145.TopKFrequentElements                            2019.9.14   java
146.IntersectionOfTwoArraysII                       2019.9.14   java
147.SumOfTwoIntegers                                2019.9.16   java
148.KthSmallestElementInASortedMatrix               2019.9.17   java
149.InsertDeleteGetRandom                           2019.9.18   java
150.ShuffleAnArray                                  2019.9.19   java
151.FirstUniqueCharacterInAString                   2019.9.19   java
152.LongestSubstringWithAtLeastKRepeatingCharacters 2019.9.20   java
153.FourSumII                                       2019.9.23   java
154.NextPermutation                                 2019.9.24   java
155.LongestValidParentheses                         2019.9.25   java
157.CombinationSum                                  2019.9.28   java
158.MinimumPathSum                                  2019.9.28   java
159.EditDistance                                    2019.9.29   java
160.MaximalRectangle                                2019.9.29   java
170.FlattenBinaryTreeToLinkedList                   2019.9.29   java
171.MaximalSquare                                   2019.9.30   java
172.InvertBinaryTree                                2019.9.30   java
173.RemoveInvalidParentheses                        2019.9.30   java
174.BestTimeToBuyAndSellStockWithCooldown           2019.10.1   java
175.HouseRobberIII                                  2019.10.2   java
176.CountingBits                                    2019.10.3   java
177.DecodeString                                    2019.10.3   java
178.EvaluateDivision                                2019.10.3   java
179.QueueReconstructionByHeight                     2019.10.3   java
180.PartitionEqualSubsetSum                         2019.10.4   java
181.PathSumIII                                      2019.10.5   java
182.FindAllAnagramsInAString                        2019.10.5   java
183.FindAllNumbersDisappearedInAnArray              2019.10.5   java
184.HammingDistance                                 2019.10.5   java
185.TargetSum                                       2019.10.7   java
186.ConvertBSTToGreaterTree                         2019.10.7   java
187.DiameterOfBinaryTree                            2019.10.7   java
188.SubarraySumEqualsK                              2019.10.8   java
189.ShortestUnsortedContinuousSubarray              2019.10.8   java
190.MergeTwoBinaryTrees                             2019.10.8   java
191.TaskScheduler                                   2019.10.9   java
192.PalindromicSubstrings                           2019.10.9   java
193.DailyTemperatures                               2019.10.10  java
194.DesignCircularQueue                             2019.10.10  java
195.OpenTheLock                                     2019.10.10  java
196.CloneGraph                                      2019.10.10  java
197.ImplementStackUsingQueues                       2019.10.12  java
198.ImplementQueueUsingStacks                       2019.10.12  java
199.FloodFill                                       2019.10.12  java
200.Matrix01                                        2019.10.12  java
201.KeysAndRooms                                    2019.10.13  java
202.FindPivotIndex                                  2019.10.14  java
203.LargestNumberAtLeastTwiceOfOthers               2019.10.14  java
204.DiagonalTraverse                                2019.10.15  java
205.AddBinary                                       2019.10.16  java
206.ArrayPartitionI                                 2019.10.18  java
207.TwoSumIIInputArrayIsSorted                      2019.10.18  java
208.RemoveElement                                   2019.10.19  java
209.MaxConsecutiveOnes                              2019.10.19  java
210.MinimumSizeSubarraySum                          2019.10.19  java
211.ReverseWordsInAString                           2019.10.19  java
212.DesignLinkedList                                2019.10.20  java
213.RemoveLinkedListElements                        2019.10.20  java
214.FlattenAMultilevelDoublyLinkedList              2019.10.20  java
215.DesignHashSet                                   2019.10.21  java
216.DesignHashMap                                   2019.10.21  java
217.IntersectionOfTwoArrays                         2019.10.22  java
218.IsomorphicStrings                               2019.10.22  java
219.MinimumIndexSumOfTwoLists                       2019.10.22  java
220.ContainsDuplicateII                             2019.10.24  java
221.FindDuplicateSubtrees                           2019.10.24  java
222.JewelsAndStones                                 2019.10.26  java
223.BinarySearch                                    2019.10.26  java
224.GuessNumberHigherOrLower                        2019.10.26  java
225.FirstBadVersion                                 2019.10.27  java
226.FindMinimumInRotatedSortedArray                 2019.10.27  java
227.FindKClosestElements                            2019.10.27  java
228.ValidPerfectSquare                              2019.10.28  java
229.FindSmallestLetterGreaterThanTarget             2019.10.28  java
230.FindMinimumInRotatedSortedArrayII               2019.10.28  java
231.FindKthSmallestPairDistance                     2019.10.29  java
232.SplitArrayLargestSum                            2019.10.30  java
233.BinaryTreePreorderTraversal                     2019.10.30  java
234.BinaryTreePostorderTraversal                    2019.10.30  java
235.PathSum                                         2019.10.31  java
236.PopulatingNextRightPointersInEachNodeII         2019.10.31  java
237.BinarySearchTreeIterator                        2019.10.31  java
238.SearchInABinarySearchTree                       2019.10.31  java
239.InsertIntoABinarySearchTree                     2019.11.1   java
240.DeleteNodeInABST                                2019.11.1   java
241.KthLargestElementInAStream                      2019.11.3   java
242.ContainsDuplicateIII                            2019.11.3   java
243.BalancedBinaryTree                              2019.11.4   java
244.NaryTreeTraversal                               2019.11.4   java
245.MapSumPairs                                     2019.11.5   java
246.ReplaceWords                                    2019.11.6   java
247.AddAndSearchWord                                2019.11.7   java
248.MaximumXOROfTwoNumbersInAnArray                 2019.11.7   java
249.PalindromePairs                                 2019.11.8   java
250.ReverseVowelsOfAString                          2019.11.9   java
251.SortCharactersByFrequency                       2019.11.9   java
252.NumberOfBoomerangs                              2019.11.10  java
253.FriendCircles                                   2019.11.10  java
254.SuperEggDrop                                    2019.11.11  java
255.NQueens                                         2019.11.13  java
256.SudokuSolver                                    2019.11.14  java
257.Combinations                                    2019.11.15  java
258.SameTree                                        2019.11.16  java
259.Shift2DGrid                                     2019.11.17  java
260.FindElementsInAContaminatedBinaryTree           2019.11.17  java
261.GreatestSumDivisibleByThree                     2019.11.17  java
262.CombineTwoTables                                2019.11.20  sql
263.ValidPhoneNumbers                               2019.11.20  shell
264.SecondHighestSalary                             2019.11.21  sql
265.PermutationInString                             2019.11.21  java
266.EmployeesEarningMoreThanTheirManagers           2019.11.22  sql
267.TenthLine                                       2019.11.22  shell
268.SimplifyPath                                    2019.11.22  java
269.RestoreIPAddresses                              2019.11.22  java
270.DuplicateEmails                                 2019.11.23  sql
271.WordFrequency                                   2019.11.23  shell
272.MinimumTimeVisitingAllPoints                    2019.11.24  java
273.CountServersThatCommunicate                     2019.11.24  java
274.SearchSuggestionsSystem                         2019.11.24  java
275.CustomersWhoNeverOrder                          2019.11.24  sql
276.TransposeFile                                   2019.11.24  shell
277.DeleteDuplicateEmails                           2019.11.26  sql
278.RisingTemperature                               2019.11.26  sql
279.PrintInOrder                                    2019.11.26  JUC
280.MaxAreaOfIsland                                 2019.11.28  java
281.LongestContinuousIncreasingSubsequence          2019.11.28  java
282.BigCountries                                    2019.11.28  sql
283.ClassesMoreThan5Students                        2019.11.28  sql
284.PrintFooBarAlternately                          2019.11.28  JUC
285.PermutationSequence                             2019.11.29  java
286.NotBoringMovies                                 2019.11.29  sql
287.SwapSalary                                      2019.11.29  sql
288.PrintZeroEvenOdd                                2019.11.29  JUC
289.Triangle                                        2019.11.30  java
290.ReformatDepartmentTable                         2019.11.30  sql
291.FindWinnerOnATicTacToeGame                      2019.12.1   java
292.NumberOfBurgersWithNoWasteOfIngredients         2019.12.1   java
293.CountSquareSubmatricesWithAllOnes               2019.12.1   java
294.RussianDollEnvelopes                            2019.11.2   java
295.NthHighestSalary                                2019.12.2   sql
296.BuildingH2O                                     2019.12.2   JUC
297.AllOoneDataStructure                            2019.12.3   java
298.RankScores                                      2019.12.3   sql
299.SearchInsertPosition                            2019.12.3   java
300.UTF8Validation                                  2019.12.4   java
301.ConsecutiveNumbers                              2019.12.4   java
302.FizzBuzzMultithreaded                           2019.12.4   JUC
303.SubtractTheProductAndSumOfDigitsOfAnInteger     2019.12.8   java
304.GroupThePeopleGivenTheGroupSizeTheyBelongTo     2019.12.8   java
305.FindTheSmallestDivisorGivenAThreshold           2019.12.8   java
306.DepartmentHighestSalary                         2019.12.9   sql
307.TheDiningPhilosophers                           2019.12.9   JUC
308.ExchangeSeats                                   2019.12.10  sql
309.LengthOfLastWord                                2019.12.10  java
310.RemoveDuplicatesFromSortedList                  2019.12.10  java
311.ExcelSheetColumnTitle                           2019.12.10  java
312.DepartmentTopThreeSalaries                      2019.12.11  sql
313.BinaryTreePaths                                 2019.12.11  java
314.ConvertBinaryNumberInALinkedListToInteger       2019.12.15  java
315.SequentialDigits                                2019.12.15  java
316.MaximumSideLengthOfASquareWithSumLessThanOrEqualToThreshold 2019.12.15  java
317.AddDigits                                       2019.12.16  java
318.TripsAndUsers                                   2019.12.18  sql
319.UglyNumber                                      2019.12.18  java
320.HumanTrafficOfStadium                           2019.12.19  sql
321.WordPattern                                     2019.12.19  java
322.BullsAndCows                                    2019.12.19  java
323.FindNumbersWithEvenNumberOfDigits               2019.12.22  java
324.DivideArrayInSetsOfKConsecutiveNumbers          2019.12.22  java
325.MaximumNumberOfOccurrencesOfASubstring          2019.12.22  java

*/

import java.util.List;

public class LeetCodeContent {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    class Node {
        public int val;
        public List<Node> next;
        public Node() {}
        public Node(int v, List<Node> n) {
            val = v;
            next = n;
        }
    }

    double a = 'a';
    char b = 1;
}
