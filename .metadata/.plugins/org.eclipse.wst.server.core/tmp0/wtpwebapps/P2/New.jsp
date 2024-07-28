<!DOCTYPE html>
<html>
<head>
    <title>MultiSelect Redirect</title>
</head>
<body>
    <h1>MultiSelect Redirect Example</h1>

    <!-- MultiSelect dropdown -->
    <select id="selectValues" multiple>
        <option value="raj">Raj</option>
        <option value="sri">Sri</option>
        <option value="alex">Alex</option>
        <!-- Add more options as needed -->
    </select>

    <!-- Button to trigger redirection -->
    <button onclick="redirectToSamePage()">Go</button>

    <script>
        function redirectToSamePage() {
            // Get the selected values from the multi-select dropdown
            let select = document.getElementById('selectValues');
            let selectedValues = [];
            for (let i = 0; i < select.options.length; i++) {
                if (select.options[i].selected) {
                    selectedValues.push(select.options[i].value);
                }
            }

            // Create the query string with the selected values
            let queryString = selectedValues.map(value => 'buttonValue=' + encodeURIComponent(value)).join('&');

            // Get the current URL
            let currentUrl = window.location.href;

            // Check if the URL already contains any parameters
            let separator = currentUrl.indexOf('?') !== -1 ? '&' : '?';

            // Create the new URL with the query string
            let newUrl = currentUrl + separator + queryString;

            // Redirect to the new URL
            window.location.href = newUrl;
        }
    </script>
</body>
</html>
