function ListofPlayers() {

    const players = [
        { name: "Virat Kohli", score: 95 },
        { name: "Rohit Sharma", score: 82 },
        { name: "Shubman Gill", score: 67 },
        { name: "KL Rahul", score: 45 },
        { name: "Hardik Pandya", score: 78 },
        { name: "Ravindra Jadeja", score: 60 },
        { name: "Rishabh Pant", score: 88 },
        { name: "Suryakumar Yadav", score: 55 },
        { name: "Jasprit Bumrah", score: 30 },
        { name: "Mohammed Siraj", score: 25 },
        { name: "Kuldeep Yadav", score: 72 }
    ];

    const lowScorers = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>List of Players</h2>

            <ul>
                {players.map((player, index) => (
                    <li key={index}>
                        {player.name} - {player.score}
                    </li>
                ))}
            </ul>

            <h2>Players with Score Below 70</h2>

            <ul>
                {lowScorers.map((player, index) => (
                    <li key={index}>
                        {player.name} - {player.score}
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default ListofPlayers;