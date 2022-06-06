/**
 */
package k8s;

import java.util.Map;

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
 *   <li>{@link k8s.LabelSelector#getMatchLabels <em>Match Labels</em>}</li>
 *   <li>{@link k8s.LabelSelector#getMatchExpressions <em>Match Expressions</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getLabelSelector()
 * @model
 * @generated
 */
public interface LabelSelector extends EObject {
	/**
	 * Returns the value of the '<em><b>Match Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Labels</em>' attribute.
	 * @see #setMatchLabels(Map)
	 * @see k8s.K8sPackage#getLabelSelector_MatchLabels()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Map<String, String> getMatchLabels();

	/**
	 * Sets the value of the '{@link k8s.LabelSelector#getMatchLabels <em>Match Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Labels</em>' attribute.
	 * @see #getMatchLabels()
	 * @generated
	 */
	void setMatchLabels(Map<String, String> value);

	/**
	 * Returns the value of the '<em><b>Match Expressions</b></em>' reference list.
	 * The list contents are of type {@link k8s.MatchExpressions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Expressions</em>' reference list.
	 * @see k8s.K8sPackage#getLabelSelector_MatchExpressions()
	 * @model
	 * @generated
	 */
	EList<MatchExpressions> getMatchExpressions();

} // LabelSelector
