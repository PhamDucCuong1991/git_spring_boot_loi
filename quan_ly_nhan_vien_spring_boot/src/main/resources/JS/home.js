let isCreate = true;
function show() {
    $.ajax({
        type: "GET",
        headers: {
            'Accept': 'application/json'
        },
        url: "http://localhost:8081/home",
        //xử lý khi thành công
        success: function (employees) {

            let str = '';
            for (const employee of employees.content) {

                str += `<tr>
                        <td>${employee.employeeCode}</td>
                        <td>${employee.name}</td>
                        <td>${employee.age}</td>
                        <td>${employee.salary}</td>
                        <td>${employee.idBranch.name}</td>
                        <td>
                         <a type="button" class="btn btn-warning" onclick="showEdit(${employee.employeeCode}))}">Edit</a>
                        </td>
                        <td>
                        <a type="button" class="btn btn-danger" onclick="xoa(${employee.employeeCode})">Delete</a>
                        </td>

                
                        </tr>`
            }
            document.getElementById("show").innerHTML = str;

        },
        error: function (err) {
            console.log(err)
        }
    })
}

show();

function add() {
    let id = document.getElementById("inputId").value;
    let title = document.getElementById("inputTitle").value;
    let content = document.getElementById("inputContent").value;
    let img = document.getElementById("inputImg").value;
    if (img.trim() === "" || title.trim() === "" || content.trim() === "") {
        alert("Xin vui lòng nhập đầy đủ thông tin");
    } else {

        blogs.push({'id':id,'title': title,'content': content,'img': img})
        alert("Tạo mới blog thành công ")
    }

    show();
}
function showEdit(id) {
    isCreate = false;
    $.ajax({
        type: "Get",
        headers: {
            'Accept': 'application/json'
        },
        url: "http://localhost:8081/home/" + id,
        //xử lý khi thành công
        success: function (blog) {
            document.getElementById("id").value = blog.id;
            $("#content").val(blog.content);
            $("#title").val(blog.title);
            $("#img").val(blog.img);
            $("#idCategoty").val(blog.category.id);
        },
        error: function (err) {
            console.log(err)
        }
    })
}


function edit(id) {
    let employee = {
        "name": document.getElementById("title").value,
        "age": $("#age").val(),
        "salary": $("#salary").val(),
        "branch": {
            "id": $("#idCategoty").val(),
        }
    }
    $.ajax({
        type: "Put",
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        url: "http://localhost:8081/blogs/" + id,
        data: JSON.stringify(blog),
        //xử lý khi thành công
        success: function (data) {
            alert("Thành công");
            show();
            clearValue();
        },
        error: function (err) {
            console.log(err)
        }
    })
}

function xoa(id) {
    let xacnhan = confirm("Bạn có chắc chắn muốn xóa ???");
    if(xacnhan){
        $.ajax({
            type: "DELETE",
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            url: "http://localhost:8081/blogs/" + id,

            success: function () {
                alert("Xóa thành công!");
                show();
            },
            error: function (err) {
                console.log(err)
            }
        })
    }

}