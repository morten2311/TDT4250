/**
 */
package course_desc.impl;

import course_desc.Course;
import course_desc.CoursePreconditions;
import course_desc.Course_descPackage;
import course_desc.Department;
import course_desc.Person;
import course_desc.Student;
import course_desc.Univ;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Univ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course_desc.impl.UnivImpl#getHasDepartment <em>Has Department</em>}</li>
 *   <li>{@link course_desc.impl.UnivImpl#getHasCourses <em>Has Courses</em>}</li>
 *   <li>{@link course_desc.impl.UnivImpl#getHasPersons <em>Has Persons</em>}</li>
 *   <li>{@link course_desc.impl.UnivImpl#getHasPrecond <em>Has Precond</em>}</li>
 *   <li>{@link course_desc.impl.UnivImpl#getHasStudents <em>Has Students</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnivImpl extends MinimalEObjectImpl.Container implements Univ {
	/**
	 * The cached value of the '{@link #getHasDepartment() <em>Has Department</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDepartment()
	 * @generated
	 * @ordered
	 */
	protected EList<Department> hasDepartment;

	/**
	 * The cached value of the '{@link #getHasCourses() <em>Has Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> hasCourses;

	/**
	 * The cached value of the '{@link #getHasPersons() <em>Has Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> hasPersons;

	/**
	 * The cached value of the '{@link #getHasPrecond() <em>Has Precond</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPrecond()
	 * @generated
	 * @ordered
	 */
	protected EList<CoursePreconditions> hasPrecond;

	/**
	 * The cached value of the '{@link #getHasStudents() <em>Has Students</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> hasStudents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnivImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Course_descPackage.Literals.UNIV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Department> getHasDepartment() {
		if (hasDepartment == null) {
			hasDepartment = new EObjectContainmentEList<Department>(Department.class, this, Course_descPackage.UNIV__HAS_DEPARTMENT);
		}
		return hasDepartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getHasCourses() {
		if (hasCourses == null) {
			hasCourses = new EObjectContainmentEList<Course>(Course.class, this, Course_descPackage.UNIV__HAS_COURSES);
		}
		return hasCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getHasPersons() {
		if (hasPersons == null) {
			hasPersons = new EObjectContainmentEList<Person>(Person.class, this, Course_descPackage.UNIV__HAS_PERSONS);
		}
		return hasPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoursePreconditions> getHasPrecond() {
		if (hasPrecond == null) {
			hasPrecond = new EObjectContainmentEList<CoursePreconditions>(CoursePreconditions.class, this, Course_descPackage.UNIV__HAS_PRECOND);
		}
		return hasPrecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getHasStudents() {
		if (hasStudents == null) {
			hasStudents = new EObjectContainmentEList<Student>(Student.class, this, Course_descPackage.UNIV__HAS_STUDENTS);
		}
		return hasStudents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Course_descPackage.UNIV__HAS_DEPARTMENT:
				return ((InternalEList<?>)getHasDepartment()).basicRemove(otherEnd, msgs);
			case Course_descPackage.UNIV__HAS_COURSES:
				return ((InternalEList<?>)getHasCourses()).basicRemove(otherEnd, msgs);
			case Course_descPackage.UNIV__HAS_PERSONS:
				return ((InternalEList<?>)getHasPersons()).basicRemove(otherEnd, msgs);
			case Course_descPackage.UNIV__HAS_PRECOND:
				return ((InternalEList<?>)getHasPrecond()).basicRemove(otherEnd, msgs);
			case Course_descPackage.UNIV__HAS_STUDENTS:
				return ((InternalEList<?>)getHasStudents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Course_descPackage.UNIV__HAS_DEPARTMENT:
				return getHasDepartment();
			case Course_descPackage.UNIV__HAS_COURSES:
				return getHasCourses();
			case Course_descPackage.UNIV__HAS_PERSONS:
				return getHasPersons();
			case Course_descPackage.UNIV__HAS_PRECOND:
				return getHasPrecond();
			case Course_descPackage.UNIV__HAS_STUDENTS:
				return getHasStudents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Course_descPackage.UNIV__HAS_DEPARTMENT:
				getHasDepartment().clear();
				getHasDepartment().addAll((Collection<? extends Department>)newValue);
				return;
			case Course_descPackage.UNIV__HAS_COURSES:
				getHasCourses().clear();
				getHasCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case Course_descPackage.UNIV__HAS_PERSONS:
				getHasPersons().clear();
				getHasPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case Course_descPackage.UNIV__HAS_PRECOND:
				getHasPrecond().clear();
				getHasPrecond().addAll((Collection<? extends CoursePreconditions>)newValue);
				return;
			case Course_descPackage.UNIV__HAS_STUDENTS:
				getHasStudents().clear();
				getHasStudents().addAll((Collection<? extends Student>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Course_descPackage.UNIV__HAS_DEPARTMENT:
				getHasDepartment().clear();
				return;
			case Course_descPackage.UNIV__HAS_COURSES:
				getHasCourses().clear();
				return;
			case Course_descPackage.UNIV__HAS_PERSONS:
				getHasPersons().clear();
				return;
			case Course_descPackage.UNIV__HAS_PRECOND:
				getHasPrecond().clear();
				return;
			case Course_descPackage.UNIV__HAS_STUDENTS:
				getHasStudents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Course_descPackage.UNIV__HAS_DEPARTMENT:
				return hasDepartment != null && !hasDepartment.isEmpty();
			case Course_descPackage.UNIV__HAS_COURSES:
				return hasCourses != null && !hasCourses.isEmpty();
			case Course_descPackage.UNIV__HAS_PERSONS:
				return hasPersons != null && !hasPersons.isEmpty();
			case Course_descPackage.UNIV__HAS_PRECOND:
				return hasPrecond != null && !hasPrecond.isEmpty();
			case Course_descPackage.UNIV__HAS_STUDENTS:
				return hasStudents != null && !hasStudents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnivImpl
