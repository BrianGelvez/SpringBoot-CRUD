// Llamada al plugin DataTables jQuery
$(document).ready(function() {
  loadUsers();
});

const loadUsers = async () => {
  try {
    const request = await fetch('api/users', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
    });
    const users = await request.json();



    let listHtml = '';

    for (let user of users) {
      let buttomDelete = '<a href="#" onclick="deleteUser('+user.id+')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
      let usuariosHTML = '<tr><td>'+user.id+'</td><td>'+user.name+'</td><td>'+user.last+'</td><td>'+user.email+'</td><td>'+user.phone+'</td><td>'+user.password+'</td><td>'+ buttomDelete +'</td></tr>'
      listHtml += usuariosHTML;
    }

    console.log(users);

    document.querySelector("#users tbody").innerHTML = listHtml;
  } catch (error) {
    console.error('Error:', error);
  }
}

const deleteUser = (id) => {
  alert(id);
}

