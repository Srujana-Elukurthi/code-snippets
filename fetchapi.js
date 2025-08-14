<!DOCTYPE html>
<html>
<head>
    <title>Fetch API Demo</title>
</head>
<body>
    <h1>Random User</h1>
    <button id="getUser">Get User</button>
    <div id="output"></div>

    <script>
        document.getElementById("getUser").addEventListener("click", () => {
            // Fetch data from Random User API
            fetch("https://randomuser.me/api/")
                .then(response => {
                    if (!response.ok) {
                        throw new Error("Network response was not ok");
                    }
                    return response.json();
                })
                .then(data => {
                    // Extract user info
                    let user = data.results[0];
                    document.getElementById("output").innerHTML = `
                        <p><strong>Name:</strong> ${user.name.first} ${user.name.last}</p>
                        <p><strong>Email:</strong> ${user.email}</p>
                        <img src="${user.picture.large}" alt="User Picture">
                    `;
                })
                .catch(error => {
                    document.getElementById("output").textContent = "Error: " + error;
                });
        });
    </script>
</body>
</html>
