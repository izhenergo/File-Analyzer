package com.exam.fileanalyzer;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.Map;

@Service
public class LogsAnalyzer
{
		/**
		 * Given a zip file, a search query, and a date range,
		 * count the number of occurrences of the search query in each file in the zip file
		 *
		 * @param searchQuery The string to search for in the file.
		 * @param zipFile The zip file to search in.
		 * @param startDate The start date of the search.
		 * @param numberOfDays The number of days to search for.
		 * @return A map of file names and the number of occurrences of the search query in the file.
		 */
		public Map<String, Integer> countEntriesInZipFile(
			String searchQuery, File zipFile, LocalDate startDate, Integer numberOfDays)
			throws IOException
		{
				throw new UnsupportedEncodingException("Need to implement!");
		}
}
