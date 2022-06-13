/**
 */
package k8s;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.LabelSelector#getMatchExpressions <em>Match Expressions</em>}</li>
 *   <li>{@link k8s.LabelSelector#getMatchLabels <em>Match Labels</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getLabelSelector()
 * @model
 * @generated
 */
public interface LabelSelector extends EObject {
	/**
	 * Returns the value of the '<em><b>Match Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link k8s.MatchExpressions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Expressions</em>' containment reference list.
	 * @see k8s.K8sPackage#getLabelSelector_MatchExpressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatchExpressions> getMatchExpressions();

	/**
	 * Returns the value of the '<em><b>Match Labels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Labels</em>' containment reference.
	 * @see #setMatchLabels(Mymap)
	 * @see k8s.K8sPackage#getLabelSelector_MatchLabels()
	 * @model containment="true"
	 * @generated
	 */
	Mymap getMatchLabels();

	/**
	 * Sets the value of the '{@link k8s.LabelSelector#getMatchLabels <em>Match Labels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Labels</em>' containment reference.
	 * @see #getMatchLabels()
	 * @generated
	 */
	void setMatchLabels(Mymap value);

} // LabelSelector
