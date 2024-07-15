class Solution {
    public String numberToWords(int num) {
        String s = Integer.toString(num);
        if(num==0)
        return "Zero";
        int n = s.length();
        int k = 0;
        int length = 3;
        String result = "";
        int numSegments = (n + length - 1) / length;
        String[] segments = new String[numSegments];

        for (int i = 0; i < numSegments; i++) {
            int start = Math.max(0, n - (i + 1) * length);
            int end = n - i * length;
            segments[numSegments - i - 1] = s.substring(start, end);
        }

        String[] segmentNames = {"", "Thousand ", "Million ", "Billion "};

        for (int j = segments.length - 1; j >= 0; j--) {
            int p = Integer.valueOf(segments[j]);
            int h = p / 100;
            int t = (p % 100) / 10;
            int o = p % 10;
            String segmentResult = "";

            if (h > 0) {
                switch (h) {
                    case 1: segmentResult += "One Hundred "; break;
                    case 2: segmentResult += "Two Hundred "; break;
                    case 3: segmentResult += "Three Hundred "; break;
                    case 4: segmentResult += "Four Hundred "; break;
                    case 5: segmentResult += "Five Hundred "; break;
                    case 6: segmentResult += "Six Hundred "; break;
                    case 7: segmentResult += "Seven Hundred "; break;
                    case 8: segmentResult += "Eight Hundred "; break;
                    case 9: segmentResult += "Nine Hundred "; break;
                    default: segmentResult += "";
                }
            }

            if (t != 1) {
                switch (t) {
                    case 2: segmentResult += "Twenty "; break;
                    case 3: segmentResult += "Thirty "; break;
                    case 4: segmentResult += "Forty "; break;
                    case 5: segmentResult += "Fifty "; break;
                    case 6: segmentResult += "Sixty "; break;
                    case 7: segmentResult += "Seventy "; break;
                    case 8: segmentResult += "Eighty "; break;
                    case 9: segmentResult += "Ninety "; break;
                    default: segmentResult += "";
                }

                switch (o) {
                    case 1: segmentResult += "One "; break;
                    case 2: segmentResult += "Two "; break;
                    case 3: segmentResult += "Three "; break;
                    case 4: segmentResult += "Four "; break;
                    case 5: segmentResult += "Five "; break;
                    case 6: segmentResult += "Six "; break;
                    case 7: segmentResult += "Seven "; break;
                    case 8: segmentResult += "Eight "; break;
                    case 9: segmentResult += "Nine "; break;
                    default: segmentResult += "";
                }
            } else {
                switch (o) {
                    case 0: segmentResult += "Ten "; break;
                    case 1: segmentResult += "Eleven "; break;
                    case 2: segmentResult += "Twelve "; break;
                    case 3: segmentResult += "Thirteen "; break;
                    case 4: segmentResult += "Fourteen "; break;
                    case 5: segmentResult += "Fifteen "; break;
                    case 6: segmentResult += "Sixteen "; break;
                    case 7: segmentResult += "Seventeen "; break;
                    case 8: segmentResult += "Eighteen "; break;
                    case 9: segmentResult += "Nineteen "; break;
                    default: segmentResult += "";
                }
            }

            if (!segmentResult.isEmpty()) {
                segmentResult += segmentNames[k];
                result = segmentResult + result;
            }

            k++;
        }

        return result.trim();
    }
}
